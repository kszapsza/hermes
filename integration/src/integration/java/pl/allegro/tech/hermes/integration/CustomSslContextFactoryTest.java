package pl.allegro.tech.hermes.integration;

import com.google.common.io.Files;
import org.mockito.Mockito;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;
import pl.allegro.tech.hermes.common.config.ConfigFactory;
import pl.allegro.tech.hermes.common.config.Configs;
import pl.allegro.tech.hermes.common.ssl.SslContextFactory;
import pl.allegro.tech.hermes.frontend.HermesFrontend;
import pl.allegro.tech.hermes.frontend.server.SslContextFactoryProvider;
import pl.allegro.tech.hermes.integration.env.FrontendStarter;
import pl.allegro.tech.hermes.test.helper.config.MutableConfigFactory;
import pl.allegro.tech.hermes.test.helper.util.Ports;

import static org.assertj.core.api.Assertions.assertThat;

public class CustomSslContextFactoryTest extends IntegrationTest { //TODO - do we need this test?

//    public static final int FRONTEND_PORT = Ports.nextAvailable();
//
//    private HermesFrontend hermesFrontend;
//    private FrontendStarter frontendStarter;
//
//    @Test
//    public void shouldInjectCustomSslContextFactoryToFrontend() throws Exception {
//        // given
//        SslContextFactory customSslContextFactory = Mockito.mock(SslContextFactory.class);
//
////        ConfigFactory configFactory = new MutableConfigFactory()
////                .overrideProperty(Configs.FRONTEND_PORT, FRONTEND_PORT)
////                .overrideProperty(Configs.FRONTEND_SSL_ENABLED, false)
////                .overrideProperty(Configs.KAFKA_AUTHORIZATION_ENABLED, false)
////                .overrideProperty(Configs.KAFKA_BROKER_LIST, kafkaClusterOne.getBootstrapServersForExternalClients())
////                .overrideProperty(Configs.ZOOKEEPER_CONNECT_STRING, hermesZookeeperOne.getConnectionString())
////                .overrideProperty(Configs.SCHEMA_REPOSITORY_SERVER_URL, schemaRegistry.getUrl())
////                .overrideProperty(Configs.MESSAGES_LOCAL_STORAGE_DIRECTORY, Files.createTempDir().getAbsolutePath());
//
//        frontendStarter = new FrontendStarter(FRONTEND_PORT);//TODO: add port?
//        frontendStarter.addSpringProfiles("shouldInjectCustomSslContextFactoryToFrontend");
//        frontendStarter.overrideProperty(Configs.FRONTEND_PORT, FRONTEND_PORT);
//        frontendStarter.overrideProperty(Configs.FRONTEND_SSL_ENABLED, false);
//        frontendStarter.overrideProperty(Configs.KAFKA_AUTHORIZATION_ENABLED, false);
//        frontendStarter.overrideProperty(Configs.KAFKA_BROKER_LIST, kafkaClusterOne.getBootstrapServersForExternalClients());
//        frontendStarter.overrideProperty(Configs.ZOOKEEPER_CONNECT_STRING, hermesZookeeperOne.getConnectionString());
//        frontendStarter.overrideProperty(Configs.SCHEMA_REPOSITORY_SERVER_URL, schemaRegistry.getUrl());
//        frontendStarter.overrideProperty(Configs.MESSAGES_LOCAL_STORAGE_DIRECTORY, Files.createTempDir().getAbsolutePath());
//        frontendStarter.start();
//
////        hermesFrontend = HermesFrontend.frontend()
////                .withBinding(configFactory, ConfigFactory.class)
////                .withSslContextFactory(customSslContextFactory)
////                .build();
////        hermesFrontend.start();
//
//        // when
////        SslContextFactoryProvider sslContextFactoryProvider = hermesFrontend.getService(SslContextFactoryProvider.class);
//        SslContextFactoryProvider sslContextFactoryProvider = frontendStarter.instance().getBean(SslContextFactoryProvider.class);//TODO - IoC
//
//        // then
//        assertThat(sslContextFactoryProvider.getSslContextFactory()).isEqualTo(customSslContextFactory);
//    }
//
//    @AfterClass
//    public void tearDown() throws Exception {
////        hermesFrontend.stop();
//        frontendStarter.stop();
//    }
}