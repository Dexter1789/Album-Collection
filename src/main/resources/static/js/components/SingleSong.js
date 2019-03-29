import SongComments from './SongComment'
import Tags from './Tags'

export default function SingleSong(song) {
    return `

    <header>
        <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
        <a href="index.html"><button class="menu__button"><i class="fa fa-bars"></i></button></a>
    </header> 
    
    <div class="singlesong__container">
        <ul class="song">
            <li class="song__title" id="${song.id}">${song.songTitle}</li>
            <li class="song__rating">Rating: ${song.rating}</li>
        </ul>

    
        <h3 class="singlesong__h3">Comments on this Song</h3>
        <ul class="song-comments">
            <li class="song-comments2">${SongComments(song.songComments)}</li>
        </ul>

        <h3 class="singlesong__h3">Tags on this Song</h3>
        <ul class="song-tags">
            <li class="song-tags2">${Tags(song.tags)}</li>
        </ul>
    </div>

        <section class="add-comments">
            <input type="text" class="add-comment__box" placeholder="Leave A Comment">
            <button class="add-comment__singleSong" id="${song.id}">Add Comment</button>
        </section>

        <section class="add-tags">
            <input type="text" class="add-tag__box" placeholder="Tag">
            <button class="add-tag__singleSong" id="${song.id}">Add Tag</button>
        </section>
    `;
}
