package dongnaoedu.normal;

import com.rabbitmq.client.BuiltinExchangeType;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 动脑学院-Mark老师
 * 创建日期：2017/10/19
 * 创建时间: 17:35
 */
public class DirectProducer {

    private final static String EXCHANGE_NAME = "direct_logs";

    public static void main(String[] args) throws IOException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
/*        factory.setUsername(..);
        factory.setPort();
        factory.setVirtualHost();*/


        Connection connection = factory.newConnection();//连接

        Channel channel = connection.createChannel();//信道

        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.DIRECT);//交换器

        String[]serverities = {"error","info","warning"};

        for(int i=0;i<3;i++){
            String server = serverities[i];
            String message = "Hello world_"+(i+1);

            channel.basicPublish(EXCHANGE_NAME,server,null,message.getBytes());
            System.out.println("Sent "+server+":"+message);

        }

        channel.close();
        connection.close();




    }

}
