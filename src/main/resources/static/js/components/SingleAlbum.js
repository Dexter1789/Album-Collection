import Songs from './Songs'

export default function SingleAlbum(album) {
    return `
    
    <ul class="album">
        <li><img id="${album.id}" class="album__image" src="${album.albumImage}"/></li>
        <li class="album__title">${album.albumTitle}</li>
        <li class="album__rating">${album.rating}</li>
      
            <ul>
            <li class="album__songs">${Songs(album.allSongs)}</li>

       
    </ul>

    

    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}