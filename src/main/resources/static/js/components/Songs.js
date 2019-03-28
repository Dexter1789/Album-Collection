export default function Songs(songs) {
  console.log(songs)
  return `
  
  ${songs.map(song => {
    return `
<div class="main__content">
    <div class="song__title"><h2>${song.songTitle}</h2>
    <p class="song__rating">${song.rating}</p>
    
    
    </div>
    </div>
    `;
  }).join('')}

</main>
<footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 

`}
 