export default function AllAlbums(albums) {
    console.log(albums);
    return albums
        .map(album => {
            return `

            <h5 class="album__title">${album.albumTitle}</h5>
          
            `;
        }).join('')
        


}