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

    <section class="add-song">
        <input type="text" class="add-song__title" placeholder="Song Title">
        <input type="text" class="add-song__duration" placeholder="Song Duration">
        <input type="text" class="add-song__rating" placeholder="Song Rating">
        <button class="add-song__submit" id="${album.id}">Add Song</button>
    </section>

    <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 
    `;
}