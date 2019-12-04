package alvin.design.proxy;

public class CinemaStatic implements Movie {
    private RealMovie movie;

    public CinemaStatic(RealMovie movie) {
//        super();
        this.movie = movie;
    }

    @Override
    public void play() {
        if (movie!=null){
            System.out.println("play前："+System.currentTimeMillis());
            movie.play();
        }
    }
}
