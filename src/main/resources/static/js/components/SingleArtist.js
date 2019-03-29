import Albums from './Albums'
import ArtistComment from './ArtistComment'
import Tags from './Tags'

export default function SingleArtist(artist) {
  
    return `
    <header>
        <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
        <a href="index.html"><button class="menu__button"><i class="fa fa-bars"></i></button></a>
    </header>

    <ul class="artist__list">
        <li>
            <div class="artist__container2">
                <img id="${artist.id}" class="artist__image2" src="${artist.artistImage}" alt="Artist Image"/>
                <h4 class="artist__name2">${artist.artistName}</h4>
                <h5 class="artist__hometown">Hometown: ${artist.hometown}</h5>
                <h5 class="artist__rating">Avg Rating: ${artist.rating}</h5>
            </div> 
        </li>
    </ul>

        <li class="artist__albums">${Albums(artist.allAlbums)}</li>

    <div class="comments__container">
        <h3>Comments on this Artist</h3>
        <ul class="comments__container__list">
        <li>${ArtistComment(artist.artistComments)}</li>
        </ul>
    </div>

    <div class="tags__container">
        <h3>Tagged with: </h3>
        <ul class="artist-tags">
            <li>${Tags(artist.tags)}</li>
        </ul>
    </div>

    <section class="add-album">
        <input type="text" class="add-album__title" placeholder="Album Title">
        <input type="text" class="add-album__image" placeholder="Album Image">
        <input type="text" class="add-album__rating" placeholder="Album Rating">
        <button class="add-album__submit" id="${artist.id}">Add Album</button>
    </section>

    <section class="add-comments">
        <input type="text" class="add-comment__box" placeholder="Leave A Comment">
        <button class="add-comment__singleArtist" id="${artist.id}">Add Comment</button>
    </section>

    <section class="add-tags">
        <input type="text" class="add-tag__box" placeholder="Tag">
        <button class="add-tag__singleArtist" id="${artist.id}">Add Tag</button>
    </section>


    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}