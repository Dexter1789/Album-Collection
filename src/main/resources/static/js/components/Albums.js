
export default function Albums(albums) {

            return `

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
        <footer>Before They Sold Out: A Hipster Music Collection © 2019</footer> 

`}
           




