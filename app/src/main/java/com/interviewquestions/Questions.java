package com.interviewquestions;

public class Questions {

//    CREATE TABLE "AndroidQuestions" ( `ID` INTEGER PRIMARY KEY AUTOINCREMENT, `Question` TEXT, `Answer` TEXT, `Category` TEXT, `Image` TEXT )

    public static final String TABLE_NAME = "AndroidQuestions";

    public static final String COLUMN_ID = "ID";
    public static final String COLUMN_QUESTION = "Question";
    public static final String COLUMN_ANSWER = "Answer";
    public static final String COLUMN_CATEGORY = "Category";
    public static final String COLUMN_IMAGE = "Image";

    private int id;
    private String question;
    private String answer;
    private String category;
    private String image;


    // Create table SQL query
    public static final String CREATE_TABLE =
            "CREATE TABLE " + TABLE_NAME + "("
                    + COLUMN_ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                    + COLUMN_QUESTION + " TEXT,"
                    + COLUMN_ANSWER + " TEXT,"
                    + COLUMN_CATEGORY + " TEXT,"
                    + COLUMN_IMAGE + " TEXT"
                    + ")";

    public Questions() {
    }

    public Questions(int id, String question, String answer, String category, String image) {
        this.id = id;
        this.question = question;
        this.answer = answer;
        this.category = category;
        this.image = image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
