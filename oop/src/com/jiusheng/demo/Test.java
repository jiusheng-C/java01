package com.jiusheng.demo;

public class Test {
    public static void main(String[] args) {
        // 目标：完成面向对象的综合小案例
        // 1、设计电影类Movies，以便创建电影对象，封装电影数据。
        Movies[] movies= new Movies[6];
        movies[0] = new Movies("战狼", "吴京", 9.5, 1);
        movies[1] = new Movies("满江红", "张译", 9.5, 2);
        movies[2] = new Movies("夏洛特烦恼", "沈腾", 9.5, 3);
        movies[3] = new Movies("你的名字", "新海诚", 9.5, 4);
        movies[4] = new Movies("从你的全世界路过","邓超",9.5,5);
        movies[5] = new Movies("肖生克的救赎", "蒂姆·罗宾斯", 9.5, 6);

        // 3、创建电影操作对象出来，专门负责电影数据的业务操作。
        MoviesOperator mo = new MoviesOperator(movies);
        mo.printallMovies();
        mo.serchMoviesByid();
    }
    public static void printMovies(Movies[] movies) {
    }
}
