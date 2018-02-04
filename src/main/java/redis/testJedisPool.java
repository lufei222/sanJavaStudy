package redis;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class testJedisPool {
    public testJedisPool(){}

    public static void main(String[] args) {
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxTotal(10);
        JedisPool pool = new JedisPool(jedisPoolConfig, "localhost", 6379);

        Jedis jedis = null;
        try{
            jedis = pool.getResource();
            jedis.set("pooledJedis", "hello jedis pool!");
            jedis.sadd("testluoset","1,2,3","");
            System.out.println(jedis.get("pooledJedis"));
        }catch(Exception e){
            e.printStackTrace();
        }finally {
            //还回pool中
            if(jedis != null){
                jedis.close();
            }
        }

        pool.close();

    }
}
