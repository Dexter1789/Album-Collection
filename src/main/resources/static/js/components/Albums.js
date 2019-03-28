
export default function Albums(albums) {

  return `
    <header>
        <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
        <a href="index.html"><button class="menu__button"><i class="fa fa-bars"></i></button></a>
    </header>

    <ul class="album__list">    
  ${albums.map(album => {
    return `
      <li>
        <div class="album__container">
            <img src="${album.albumImage}" class="album__image" id="${album.id}">
        
            <h2 class="album__name">${album.albumTitle}</h2>
            <p class="album__rating">Rating: ${album.rating}</p>
          
        </div>
      </li>
              
 
      `;
      
    }).join('')}
    </ul>    
`}
           




