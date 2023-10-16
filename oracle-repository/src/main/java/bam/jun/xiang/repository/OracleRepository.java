package bam.jun.xiang.repository;

import bam.jun.xiang.spi.IRepository;

public class OracleRepository implements IRepository {
    @Override
    public void connect(String url) {
        System.out.println("connect"+url+"to Oracle");
    }
}
