module stocks.producer.services {
    requires spring.beans;
    requires spring.core;
    requires spring.context;
    requires spring.kafka;
    requires kafka.clients;
    requires spring.boot.autoconfigure;
    requires spring.boot;
    requires java.logging;
    requires spring.web;
    opens com.saji.kafka to spring.core, spring.context;
    opens com.saji.kafka.service to spring.core, spring.context;
    opens com.saji.kafka.config to spring.core, spring.context;
    opens com.saji.kafka.controller to spring.core, spring.context;
    exports com.saji.kafka to spring.beans;
    exports com.saji.kafka.config to spring.beans;
    exports com.saji.kafka.service to spring.beans;
    exports com.saji.kafka.controller to spring.beans;
}