package pl.lodz.uni.math.domain;

import java.util.Date;

public class Package {
    private String description;
    private Date date;
    private Integer countOfMoves;
    private Float hash;
    private Boolean priority;

    public String getDescription() {
        return description;
    }

    public Date getDate() {
        return date;
    }

    public Integer getCountOfMoves() {
        return countOfMoves;
    }

    public Float getHash() {
        return hash;
    }

    public Boolean getPriority() {
        return priority;
    }
}
