package pl.ciek4wsky_projekt1.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.ciek4wsky_projekt1.model.Post;
import pl.ciek4wsky_projekt1.repository.PostRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostRepository postRepository;
    public List<Post> getPosts() {
        return postRepository.findAll();
    }

    public Post getSinglePost(long id) {
        return postRepository.findById(id)
                .orElseThrow();
    }
}
