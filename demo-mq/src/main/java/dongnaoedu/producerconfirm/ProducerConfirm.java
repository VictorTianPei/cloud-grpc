package dongnaoedu.producerconfirm;

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
 * 发送方确认同步模式
 */
public class ProducerConfirm {

    private final static String EXCHANGE_NAME = "producer_confirm";
    private final static String ROUTE_KEY = "error";

    public static void main(String[] args) throws IOException, TimeoutException,
            InterruptedException {

    }

}
