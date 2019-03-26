import Songs from './Songs'

export default function Albums(albums) {
    return `
        <ul class="album">
        ${albums.map(album => {
        return `
            <h3 class="album__title">${album.albumTitle}</h3>
            <img class="album__image" src="${album.albumImage}"/>
            <p class="album__rating">${album.rating}</p>
            </li>
        `;


    }).join('')}
    </ul>
    <section class="add-album">
    <input type="text" class="add-album__title" placeholder="Album Title">
    <input type="text" class="add-album__image" placeholder="Album Image">
    <input type="text" class="add-album__rating" placeholder="Album Rating">
    <button class="add-album__submit">Add Album</button>
    </section>
    `;

}