import Songs from './Songs'
import AlbumComment from './AlbumComment'
import Tags from './Tags'

export default function SingleAlbum(album) {
    return `
    <header>
        <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
        <a href="index.html"><button class="menu__button"><i class="fa fa-bars"></i></button></a>
    </header>

    <ul class="singlealbum__list">
        <li>
            <div class="singlealbum__container2">
                <img id="${album.id}" class="singlealbum__image2" src="${album.albumImage}" alt="Artist Image"/>
                <h4 class="singlealbum__name2">${album.albumTitle}</h4>
                <h5 class="singlealbum__rating">Rating: ${album.rating}</h5>
            </div> 
        </li>   
    </ul>

  
                <li class="singlealbum__songs">${Songs(album.allSongs)}</li>


    <div class="comments__container">
        <h3>Comments on this Album</h3>
        <ul class="comments__container__list">
            <li>${AlbumComment(album.albumComments)}</li>
        </ul>
    </div>

    <div class="tags__container">
        <h3>Tagged with: </h3>
        <ul class="album-tags">
            <li>${Tags(album.tags)}</li>
        </ul>
    </div>

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


