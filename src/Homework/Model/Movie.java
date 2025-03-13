package Homework.Model;

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
    @Override
    public String toString() {
        return "Movie " +
                "id = " + id + '\n' +
                ", uuid = '" + uuid + '\n' +
                ", title = '" + title + '\n' +
                ", description = '" + description + '\n' +
                ", publishedDate = " + duration + '\n' +
                ", categories = " + categories;
    }
}
