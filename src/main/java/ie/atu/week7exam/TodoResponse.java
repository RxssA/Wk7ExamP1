package ie.atu.week7exam;

public class TodoResponse {
    private final TodoClient todoClient;


    public TodoResponse(TodoClient todoClient) {
        this.todoClient = todoClient;
    }

    public TodoResponse fetchData() {
        TodoResponse td = todoClient.fetchData();
        System.out.println(td);

        return td;
    }
}
