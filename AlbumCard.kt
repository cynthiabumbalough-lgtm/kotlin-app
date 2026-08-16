package com.laioffer.spotify.ui.playlist

// 1. 导入必要的 Compose 和 Material3 组件
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import coil.compose.AsyncImage
import com.laioffer.spotify.datamodel.Album
// 2. 正确导入你的 Album 数据类

// 3. 核心 UI 组件：用 @Composable 函数，而不是 class
@Composable
fun AlbumCard(
    album: Album,
    modifier: Modifier = Modifier
) {
    Card(modifier = modifier.padding(8.dp)) {
        Column(modifier = Modifier.padding(16.dp)) {
            AsyncImage(
                model = album.cover,
                contentDescription = album.name,
                modifier = Modifier.padding(bottom = 8.dp)
            )
            Text(text = album.name)
            Text(text = album.artists)
        }
    }
}

// 4. 预览函数，必须同时有 @Preview 和 @Composable
@Preview
@Composable
fun AlbumCardPreview() {
    AlbumCard(album = Album.empty())
}