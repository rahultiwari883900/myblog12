package myblog.myblog12.Service.Impl;

import myblog.myblog12.Entity.Post;
import myblog.myblog12.Payload.PostDto;
import myblog.myblog12.Repository.PostRepository;
import myblog.myblog12.Service.PostService;
import org.springframework.stereotype.Service;

@Service
public class PostServiceImpl  implements PostService {


   private  PostRepository postRepo;

    public PostServiceImpl(PostRepository postRepo) {
        this.postRepo = postRepo;
    }

    @Override
    public PostDto createRecord(PostDto postdto) {
        Post post = new Post();
        post.setTitel(postdto.getTitel());
        post.setDescription(postdto.getDescription());
        post.setContext(postdto.getContext());
       Post savedPost=  postRepo.save(post);
       PostDto dto = new PostDto();
       dto.setTitel(savedPost.getTitel());
        dto.setContext(savedPost.getContext());
        dto.setDescription(savedPost.getDescription());

        return dto;




    }
}
