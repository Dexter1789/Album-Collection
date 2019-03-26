export default function AllSongs(songs) {
    console.log(songs);
    return songs.map(song => {
            return `

            <h5 class="song__title">${song.songTitle}</h5>
          
            `;
        }).join('')
        


}