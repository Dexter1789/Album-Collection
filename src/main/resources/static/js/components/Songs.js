import SongComments from './SongComment'

export default function Songs(songs) {
  console.log(songs)
  return `
  
  ${songs.map(song => {
    return `
<div class="main__content">
    <h2 class="song__title" id="${song.id}">${song.songTitle}</h2>
    <p class="song__rating">${song.rating}</p>
    

    
    </div>
    </div>
    `;
  }).join('')}


</main>


`}
 