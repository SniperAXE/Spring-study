package edu.nf.demo1.factory;

import edu.nf.demo1.util.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.FactoryBean;

/**
 * @author Administrator
 * @date 2020/12/2
 */
public class MapperFactoryBean<T> implements FactoryBean<T> {

    private Class<T> daoInterface;

    public void setDaoInterface(Class<T> daoInterface) {
        this.daoInterface = daoInterface;
    }

    @Override
    public T getObject() throws Exception {
        SqlSession sqlSession = MybatisUtils.getSqlSession();
        T mapperProxy = sqlSession.getMapper(daoInterface);
        return mapperProxy;
    }

    @Override
    public Class<?> getObjectType() {
        return daoInterface;
    }

    @Override
    public boolean isSingleton() {
        return false;
    }
}