package optional;

import optional.domain.Manga;
import optional.repository.MangaRepository;

import java.util.Optional;

public class OptionalTest2 {
    public static void main(String[] args) {
        Optional<Manga> mangaByTitle = MangaRepository.findByTittle("Boku no hero");
        mangaByTitle.ifPresent(m -> m.setTitle("Boku no hero 2"));
        System.out.println(mangaByTitle);

        Manga mangaById = MangaRepository.findById(2).orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTittle("Drifters").orElseGet(() -> new Manga(3, "Drifters", 20));
        System.out.println(newManga);
    }
}
