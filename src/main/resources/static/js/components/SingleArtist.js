import Albums from './Albums'

export default function SingleArtist(artist) {
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



    
    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}