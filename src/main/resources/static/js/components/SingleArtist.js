import Albums from './Albums'
import ArtistComment from './ArtistComment'

export default function SingleArtist(artist) {
    console.log(artist)
    return `
    
    <ul class="artist">
        <li><img id="${artist.id}" class="artist__image" src="${artist.artistImage}"/></li>
        <li class="artist__name">${artist.artistName}</li>
        <li class="artist__age">${artist.age}</li>
        <li class="artist__hometown">${artist.hometown}</li>
        <li class="artist__rating">${artist.rating}</li>
            <ul>
            <li class="artist__albums">${Albums(artist.allAlbums)}</li>

       
    </ul>
    <h3>Comments on this Artist</h3>
    <ul class="artist-comments">
        <li>${ArtistComment(artist.artistComments)}</li>
    </ul>

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


    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}