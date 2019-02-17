package dongnaoedu.normal;

import com.rabbitmq.client.*;

import java.io.IOException;
import java.util.concurrent.TimeoutException;

/**
 * 动脑学院-Mark老师
 * 创建日期：2017/10/19
 * 创建时间: 22:10
 */
public class ConsumerAll {
    //private static final String EXCHANGE_NAME = "direct_logs";
    private static final String EXCHANGE_NAME = "fanout_logs_1";

    public static void main(String[] argv) throws IOException,
            InterruptedException, TimeoutException {

        ConnectionFactory factory = new ConnectionFactory();
        factory.setHost("127.0.0.1");
        Connection connection = factory.newConnection();//连接
        Channel channel = connection.createChannel();//信道
        channel.exchangeDeclare(EXCHANGE_NAME, BuiltinExchangeType.FANOUT);//交换器
        //声明随机队列
       // String queueName = channel.queueDeclare().getQueue();
        String queueName = "anewqueue";
        channel.queueDeclarePassive(queueName);
        System.out.println("queueName:" + queueName);
        String[]serverities = {"error","info","warning"};
        for(String server:serverities){
            //队列和交换器的绑定
            channel.queueBind(queueName,EXCHANGE_NAME,server);
        }
        System.out.println("Waiting message.......");

        Consumer consumerA = new DefaultConsumer(channel){
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body)
                    throws IOException {
                String message = new String(body,"UTF-8");
                System.out.println("Accept:"+envelope.getRoutingKey()+":"+message);
                System.out.println(connection.toString());
                System.out.println(channel.toString());
            }
        };

        channel.basicConsume(queueName,true,consumerA);

    }
}
