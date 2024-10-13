package cn.carClub.dto;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DeHua on 2024/6/21.
 */
public class Data<T> {
    private boolean success;
    private String message;


    private List<T> tmp;

    public Data(boolean success, String message, List<T> tmp) {
        this.success = success;
        this.message = message;
        this.tmp = tmp;
    }

    public Data(boolean success, String message) {
        this.success = success;
        this.message = message;
        tmp = new ArrayList<>();
    }
}
