import Songs from './Songs'
import AlbumComment from './AlbumComment'
import Tags from './Tags'

export default function SingleAlbum(album) {
    return `
    
    <ul class="album">
        <li><img id="${album.id}" class="album__image" src="${album.albumImage}"/></li>
        <li class="album__title">${album.albumTitle}</li>
        <li class="album__rating">${album.rating}</li>
      
            <ul>
            <li class="album__songs">${Songs(album.allSongs)}</li>

       
    </ul>

   
    <h3>Comments on this Album</h3>
    <ul class="album-comments">
        <li>${AlbumComment(album.albumComments)}</li>
    </ul>

    <h3>Tags on this Album</h3>
    <ul class="album-tags">
        <li>${Tags(album.tags)}</li>
    </ul>


    <section class="add-song">
        <input type="text" class="add-song__title" placeholder="Song Title">
        <input type="text" class="add-song__duration" placeholder="Song Duration">
        <input type="text" class="add-song__rating" placeholder="Song Rating">
        <button class="add-song__submit" id="${album.id}">Add Song</button>
    </section>

    <section class="add-comments">
        <input type="text" class="add-comment__box" placeholder="Leave A Comment">
        <button class="add-comment__singleAlbum" id="${album.id}">Add Comment</button>
    </section>

    <section class="add-tags">
        <input type="text" class="add-tag__box" placeholder="Tag">
        <button class="add-tag__singleAlbum" id="${album.id}">Add Tag</button>
    </section>

    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}


