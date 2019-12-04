package alvin.design.proxy;

public class RealMovie implements Movie {
    @Override
    public void play() {
        System.out.println("电影播放play...................");
    }
}
