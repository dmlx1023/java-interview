package com.zycat.springbootmybatis;

import org.apache.ibatis.executor.statement.BaseStatementHandler;
import org.apache.ibatis.executor.statement.RoutingStatementHandler;
import org.apache.ibatis.executor.statement.StatementHandler;
import org.apache.ibatis.plugin.Interceptor;
import org.apache.ibatis.plugin.Intercepts;
import org.apache.ibatis.plugin.Invocation;
import org.apache.ibatis.plugin.Signature;
import org.apache.ibatis.session.ResultHandler;
import org.springframework.stereotype.Component;

import java.sql.Statement;

@Intercepts(@Signature(type = StatementHandler.class,method = "query",args =  {Statement.class, ResultHandler.class}))
@Component
public class SqlIntercept implements Interceptor {
    @Override
    public Object intercept(Invocation invocation) throws Throwable {
        RoutingStatementHandler handler = (RoutingStatementHandler) invocation.getTarget();
        String sql=handler.getBoundSql().getSql();
        System.out.println("sql为"+sql);
        return invocation.proceed();
    }
}
