import Albums from './Albums'
export default function Artists(artists) {

    return `
    <header>
    <a href="index.html"><img class="logo" src="https://raw.githubusercontent.com/nate-fritz/nate-fritz.github.io/master/static/media/white-logo-no-bg.png"></a>
    </header>
    
    <div class="artist__box">
            ${artists.map(artist => {
            console.log(artists)
                return `
                <img id="${artist.id}" class="artist__image" src="${artist.artistImage}"/>
                <p class="artist__name">${artist.artistName}</p>
    </div>
    `;
    
    }).join('')}
        <section class="add-artist">
            <input type="text" class="add-artist__name" placeholder="Artist's Name">
            <input type="text" class="add-artist__image" placeholder="Artist's Image">
            <input type="text" class="add-artist__age" placeholder="Artist's Age">
            <input type="text" class="add-artist__hometown" placeholder="Artist's Hometown">
            <input type="text" class="add-artist__rating" placeholder="Artist Rating">
            <button class="add-artist__submit">Add Artist</button>
        </section>
    
    
    `;
}
