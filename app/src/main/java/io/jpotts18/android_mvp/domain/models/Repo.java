package io.jpotts18.android_mvp.domain.models;

import com.google.gson.annotations.SerializedName;

/**
 * Created by jpotts18 on 5/12/15.
 */
public class Repo {
    public int id;
    public String name;
    public boolean fork;
    @SerializedName("stargazers_count")
    public int stars;
}
