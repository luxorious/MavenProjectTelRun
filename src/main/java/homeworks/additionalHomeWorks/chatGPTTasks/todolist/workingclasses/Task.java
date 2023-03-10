package homeworks.additionalHomeWorks.chatGPTTasks.todolist.workingclasses;

public class Task {
    private String nameOfTask;
    private String describe;
    private String status;



    public Task(String nameOfTask, String describe) {
        this.nameOfTask = nameOfTask;
        this.describe = describe;
        this.status = "new";
    }

    public String getNameOfTask() {
        return nameOfTask;
    }

    public String getDescribe() {
        return describe;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
