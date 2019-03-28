import Albums from './Albums'

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

    <section class="add-album">
        <input type="text" class="add-album__title" placeholder="Album Title">
        <input type="text" class="add-album__image" placeholder="Album Image">
        <input type="text" class="add-album__rating" placeholder="Album Rating">
        <button class="add-album__submit" id="${artist.id}">Add Album</button>
    </section>


    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}