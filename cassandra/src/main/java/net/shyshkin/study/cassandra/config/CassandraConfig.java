package net.shyshkin.study.cassandra.config;

import net.shyshkin.study.cassandra.domain.Product;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
import org.springframework.data.cassandra.config.SchemaAction;
import org.springframework.data.cassandra.core.cql.keyspace.CreateKeyspaceSpecification;
import org.springframework.data.cassandra.core.cql.keyspace.KeyspaceOption;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@Configuration
public class CassandraConfig extends AbstractCassandraConfiguration {

    private final String keyspaceName;

    public CassandraConfig(@Value("${spring.data.cassandra.keyspace-name}") String keyspaceName) {
        this.keyspaceName = keyspaceName;
    }

    @Override
    protected String getKeyspaceName() {
        return keyspaceName;
    }

    @Override
    public SchemaAction getSchemaAction() {
        return SchemaAction.CREATE_IF_NOT_EXISTS;
    }

    @Override
    protected List<CreateKeyspaceSpecification> getKeyspaceCreations() {
        CreateKeyspaceSpecification specification = CreateKeyspaceSpecification.createKeyspace(keyspaceName)
                .with(KeyspaceOption.DURABLE_WRITES, true)
                .ifNotExists();

        return Collections.singletonList(specification);
    }

    @Override
    public String[] getEntityBasePackages() {
        return new String[]{Product.class.getPackageName()};
    }
}
