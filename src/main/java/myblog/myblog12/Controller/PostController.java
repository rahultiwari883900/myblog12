package myblog.myblog12.Controller;

import myblog.myblog12.Payload.PostDto;
import myblog.myblog12.Service.PostService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/post")

public class PostController {
   private PostService service;

    public PostController(PostService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<PostDto> cretePost(@RequestBody PostDto postdto){
        PostDto dto =service.createRecord(postdto);
return  new ResponseEntity<>(dto, HttpStatus.CREATED);

    }

}
