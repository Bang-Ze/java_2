package Homework.Model;

import java.sql.Time;
import java.util.Set;

public class Movie {
    private Integer id;
    private String uuid;
    private String title;
    private String description;
    private String duration;
    private Set<String> categories;
    //
    public void setMovieDetail(Integer id,
                            String mUuid,
                            String mTitle,
                            String mDescription,
                            String mduration,
                            Set<String> mCategories) {
        this.id = id;
        this.uuid = mUuid;
        this.title = mTitle;
        this.description = mDescription;
        this.duration = mduration;
        this.categories = mCategories;
    }
//    public void getMovieDetail(){
//        System.out.println("Movie ID: " + this.id);
//        System.out.println("Movie UUID: " + this.uuid);
//        System.out.println("Movie title: " + this.title);
//        System.out.println("Movie description: " + this.description);
//        System.out.println("Movie duration: " + this.duration);
//        System.out.println("Movie categories: " + this.categories);
//        System.out.println();
//    }
    @Override
    public String toString() {
        return "Movie " +
                "id = " + id +
                ", uuid = '" + uuid + '\'' +
                ", title = '" + title + '\'' +
                ", description = '" + description + '\'' +
                ", publishedDate = " + duration +
                ", categories = " + categories;
    }
}
