package caoyu.io.roombasic;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Word {

    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "english_meaing")
    private String english;
    @ColumnInfo(name = "chinese_meaing")
    private String chinese;

    public Word(String english, String chinese) {
        this.english = english;
        this.chinese = chinese;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEnglish() {
        return english;
    }

    public void setEnglish(String english) {
        this.english = english;
    }

    public String getChinese() {
        return chinese;
    }

    public void setChinese(String chinese) {
        this.chinese = chinese;
    }
}
