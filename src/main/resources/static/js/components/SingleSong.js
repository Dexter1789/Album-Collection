import SongComments from './SongComment'

export default function SingleSong(song) {
    return `
    
    <ul class="song">
        <li class="song__title" id="${song.id}">${song.songTitle}</li>
        <li class="song__rating">${song.rating}</li>
    </ul>

   
    <h3>Comments on this Song</h3>
    <ul class="song-comments">
        <li>${SongComments(song.songComments)}</li>
    </ul>

    <section class="add-comments">
        <input type="text" class="add-comment__box" placeholder="Leave A Comment">
        <button class="add-comment__singleSong" id="${song.id}">Add Comment</button>
    </section>

    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}
