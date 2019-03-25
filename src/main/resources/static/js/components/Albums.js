export default function Albums(albums) {
    console.log(albums);
    return albums
        .map(album => {
            return `
            <li class="album">
            <h5 class="album__title">${album.albumName}</h5>
            <img class="album__image" src="${album.albumImage}"/>
            <p class="album__rating">${album.rating}</p>
            </li>
            `;
        }).join('')


}