package com.jiusheng.demo;

import java.util.Scanner;

public class MoviesOperator {
    // 打印所有电影的信息
    private Movies[] movies;
    public MoviesOperator(Movies[] movies) {
        this.movies = movies;
    }
    public void printallMovies(){
        System.out.println("==========全部电影信息==========");
        for (int i = 0; i < movies.length; i++){
            System.out.println(movies[i].getId() + "\t" + movies[i].getName() + "\t" + movies[i].getActor() + "\t" + movies[i].getPrice());
        }
    }

    // 根据电影id查询这个电影的信息
    public void serchMoviesByid() {
        System.out.println("==========根据id查询电影信息==========");
        System.out.println("请输入要查询的id：");
        Scanner sc = new Scanner(System.in);
        int id = sc.nextInt();
        for(int i = 0; i < movies.length; i++){
            if(movies[i].getId() == id){
                System.out.println(movies[i].getId() + "\t" + movies[i].getName() + "\t" + movies[i].getActor() + "\t" + movies[i].getPrice());
                return;
            }
        }
        System.out.println("没有找到该id对应的电影信息!");
    }
}
