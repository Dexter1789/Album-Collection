
export default function Albums(albums) {

            return `
            <header>
            <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
            </header>
${albums.map(album => {
  return `
<div class="main__content">
              <div class="content__img"><img src="${album.albumImage}"></div> 
              <div class="main__text"><h2>${album.albumTitle}</h2>
              <p class="album__rating">${album.rating}</p>
              
              
              </div>
              </div>
              `;
            }).join('')}
            
           
        </main>
        

`}
           




