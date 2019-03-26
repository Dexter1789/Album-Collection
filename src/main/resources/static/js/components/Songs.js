export default function Songs(songs) {
    return `
        <ul class="songs">
        ${songs.map(song => {
        return `
            <li class="song">
            <h5 class="song__title">${song.songTitle}</h5>
            <p class="song__duration">${song.duration}</p>
            <p class="song__rating">${song.rating}</p>
            <p class="song__album">${song.album}</p>
            </li>
        `;


    }).join('')}
    </ul>
    <section class="add-song">
    <input type="text" class="add-song__title" placeholder="Song Title">
    <input type="text" class="add-song__duration" placeholder="Song Duration">
    <input type="text" class="add-song__rating" placeholder="Song Rating">
    <input type="text" class="add-song__album" placeholder="Song Album">
    <button class="add-song__submit">Add Song</button>
    </section>
    `;

}