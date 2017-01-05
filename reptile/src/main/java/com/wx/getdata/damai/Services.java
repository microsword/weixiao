package com.wx.getdata.damai;

import com.wx.getdata.entity.Activity;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class Services {
	
	public void insertActivity(List<Activity> activity) {
        // mybatis的配置文件
        String resource = "config.xml";
        InputStream inputStream = null;
        SqlSession sqlSession = null;
        try {
            inputStream = Resources.getResourceAsStream(resource);
            // 1.创建会话工场,传入mybatis的配置文件信息
            SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder()
                    .build(inputStream);
            // 2.通过工厂得到SqlSession
            sqlSession = sqlSessionFactory.openSession();
            //插入用户的对象

            // 3.通过sqlSession操作数据库
            // 第一个参数：映射文件中的statement的Id,等于namespace + "." + statement的id;
            // 第二个参数:指定和映射文件中所匹配的parameterType类型的参数;
            // sqlSession.selectOne结果是与映射文件所匹配的resultType类型的对象;
            Mapper beanmapper = sqlSession.getMapper(Mapper.class);
            beanmapper.insertActivity(activity);
            //sqlSession.insert("test.insertBean", bean);
            //执行提交事务 
            sqlSession.commit();
            
            //项目中经常需要 获取新增的用户的主键
            //System.out.println(bean.size());

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
	

}
