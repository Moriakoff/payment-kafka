/*
package moriakoff.kafka.payment.configuration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PreDestroy;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

@Component
public class InitializingConfig implements InitializingBean {

    private static final Logger LOG =
            LoggerFactory.getLogger(InitializingConfig.class);

    private Process startZookeper;

    private Process startKafka;

    public InitializingConfig() {
        try {
            startZookeper = Runtime.getRuntime().
                    exec("zookeeper-server-start /usr/local/etc/kafka/zookeeper.properties");
        watch(startZookeper);

            startKafka = Runtime.getRuntime()
                    .exec("kafka-server-start /usr/local/etc/kafka/server.properties");

            watch(startKafka);
        } catch (IOException e) {
            LOG.info(e.getMessage());
        }
    }

    @PreDestroy
    public void closeApplication(){
        startZookeper.destroy();
        startKafka.destroy();
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    private static void watch(final Process process) {
        new Thread(() -> {
            BufferedReader input = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line = null;
            try {
                while ((line = input.readLine()) != null) {
                    LOG.info(line);
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }).start();
    }
}
*/
