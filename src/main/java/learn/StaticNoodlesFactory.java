package learn;

public class StaticNoodlesFactory {
    /**
     * 传入Class实例化面条产品类
     *
     * @param clz
     * @param <T>
     * @return
     */
    public static <T extends INoodles> T createNoodles(Class<T> clz) {
        T result = null;
        try {
            result = (T) Class.forName(clz.getName()).newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
}
class PaoNoodles extends INoodles {
    @Override
    public void desc() {
        System.out.println("泡面好吃 可不要贪杯");
    }
}
class LzNoodles extends INoodles {
    @Override
    public void desc() {
        System.out.println("兰州拉面 上海的好贵 家里才5 6块钱一碗");
    }
}
