package bam.jun.xiang.spi;

/**
 * 定义spi接口类 定义一个连接方法
 * 注意：  MATE-INF 里的文件名称是这个接口类的 加载路径 即 package+"."+类名称 如  bam.jun.xiang.spi.IRepository
 * 文件里面是具体事项类的加载路径 如  bam.jun.xiang.repository.MongoRepository 其中一个实现类
 */
public interface IRepository {
    /**
     * 建立连接
     * @param url
     */
    void connect(String url);
}
