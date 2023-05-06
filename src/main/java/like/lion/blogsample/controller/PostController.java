package like.lion.blogsample.controller;

//RestController 어노테이션 작성
//작성, 조회에 대한 url Mapping 컨트롤러 메서드 작성
public class PostController {
    //작성(CRUD 중 Create)는 Post 메서드를 사용
    //PostMapping 어노테이션을 사용하면 해당 메서드는 매핑된 url의 post 요청을 처리함
    //작성할 내용에 대한 요청에 대한 내용을 body로 받음 (Post 요청에서는 거의 무조건 요청에 대한 내용을 body로 받는다.)
    //RequestBody 어노테이션을 이용해 Post 클래스를 인자로 받음
    //Body는 json타입으로 프론트로부터 요청을 받게 됨


    //조회(CRUD 중 Read)는 Get 메서드를 사용
    //GetMapping 어노테이션을 사용하면 해당 메서드는 매핑된 url의 get 요청을 처리함
    //pk를 이용한 단건 조회를 위해 PathVariable 어노테이션을 사용하여 인자로 post의 id값을 받음
    //조회된 Post의 정보를 Post 클래스의 인스턴스에 담아서 반환
}
