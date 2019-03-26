export default function AllArtists(artists) {
    console.log(artists);
    return artists
        .map(artist => {
            return `

            <h5 class="artist__name">${artist.firstName} ${artist.lastName}</h5>
          
            `;
        }).join('')
        


}