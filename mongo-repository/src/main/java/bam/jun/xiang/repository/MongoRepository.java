package bam.jun.xiang.repository;

import bam.jun.xiang.spi.IRepository;

/**
 * 实现接口类方法  实现mongo自定义方法
 */
public class MongoRepository implements IRepository {
    @Override
    public void connect(String url) {
        System.out.println("connect"+url+"to Mongo");
    }
}
